class Solution {
    
    // board will be iterated and we are going to maintain 3 HashMaps as per below to find the answer
    // HashMap for rows to check validity for rows  =>  HashMap<Character, HashMap<Character,Integer>>
    // HashMap for columns to check validity for columns  =>  HashMap<Character, HashMap<Character,Integer>>
    // HashMap for subgrid to check validity for subgrid  =>  HashMap<String, HashMap<Character,Integer>>
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, HashSet<Character>> rows = new HashMap<>();
        Map<Integer, HashSet<Character>> cols = new HashMap<>();
        Map<Pair<Integer,Integer>, HashSet<Character>> subgrid= new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val = board[i][j];
                if(val == '.') continue;

                if(rows.computeIfAbsent(i, k->new HashSet()).contains(val)) return false;
                if(cols.computeIfAbsent(j, k->new HashSet()).contains(val)) return false;
                if(subgrid.computeIfAbsent(new Pair(i/3, j/3), k->new HashSet()).contains(val)) return false;

                rows.get(i).add(val);
                cols.get(j).add(val);
                subgrid.get(new Pair(i/3, j/3)).add(val);
            }
        }
        return true;
    }
}
