class Solution {
public:
    

    int calPoints(vector<string>& operations) {
        vector<int>record;
        int sum=0;
        for(int i=0; i<operations.size(); i++){
          if (operations[i] != "C" && operations[i] != "D" && operations[i] != "+") {
            record.push_back(stoi(operations[i])); 
            }else if(operations[i] == "C"){
            if(!record.empty())
            record.pop_back();
           }else if(operations[i] == "D"){
            int p= record.back()*2;
            record.push_back(p);
           }else if(operations[i] == "+"){
            int value =  record[record.size()-1] + record[record.size()-2];
            record.push_back(value);
           }
            
        }
        for(int x : record){
            sum +=x;
        }
        return sum;
    }
};