#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
bool check(int* nums, int numsSize) {
    int count=-1,temp,i,j;
    
        for(i=0;i<numsSize-1;i++){
            if(nums[i]>nums[i+1]){
                count=i;
                break;
            }
            
        }        
        if(count>-1){
        	
            for(i=0;i<=count;i++){
            	
                temp=nums[0];
                for(j=0;j<numsSize-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[numsSize-1]=temp;
            }
        }
      	for(i=0;i<numsSize;i++){
      		printf("%d",nums[i]);
		  }
        for(i=0;i<numsSize-1;i++){
        	
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
}
int main(){
	int n,i;
	scanf("%d",&n);
	int *arr=(int*)malloc(n*sizeof(int));
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	if(check(arr,n))
		printf("true");
	else
		printf("false");
	return 0;
}
