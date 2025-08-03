package Question7;

public class SortingApp {
    public static void InsertionSort(ProposalRecord[] proposals){
        //initially the marker is at position 0 so we assume the first element is sorted and iterate from the second element to the last moving
        //them to their appropriate position,,we are sorting in reverse order
        for(int marker=0;marker<proposals.length;marker++){
            ProposalRecord current=proposals[marker+1];
            int count=marker+1;
            while(current.getProposalScore()>proposals[count].getProposalScore()&&count>0){
                proposals[count]=proposals[count-1];
                count--;
            }
            proposals[count]=current;
        }
    }

    public static void SelectionSort(ProposalRecord[] proposals){
        //keep a tracker for the sorted part
        //iterate over the array cheching for the largest element from the sorted array part
        for(int i=0;i<proposals.length;i++){
            ProposalRecord max=proposals[i];
            int maxpos=i;

            for(int j=i;j< proposals.length;j++){
                if(proposals[j].getProposalScore()>max.getProposalScore()){
                    //set it to maximum
                    max=proposals[j];
                    maxpos=j;
                }
                else if(proposals[j].getProposalScore()==max.getProposalScore()){
                    //find the one whose name is larger and set it to max
                    int comparison=max.getTitle().compareToIgnoreCase(proposals[j].getTitle());
                    if(comparison<=0) {
                        max=proposals[j];
                        maxpos=j;
                    }

                }
            }
            ProposalRecord curr=proposals[i];
            proposals[i]=max;
            proposals[maxpos]=curr;

        }

    }
}
