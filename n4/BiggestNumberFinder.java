interface BiggestNumberFinder {
         int findTheBiggestNumber(int[] numbers);
    }
    class FindBiggestNumber implements BiggestNumberFinder{
        public int findTheBiggestNumber(int[] numbers){
            int k = 0;
            for(int i = 1 ; i < numbers.length ; i ++){
                if(numbers[k]<numbers[i])
                    k = i;
            }
            return numbers[k];
        }
    }
