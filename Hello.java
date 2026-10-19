let arr=[1,2,3,4,5];
let result=[];

for(let i=arr.length-1;i>=0;i--){
    result.push(arr[i]);
}
console.log(result);

let arr=[10,25,5,40,56];
let largest=arr[0];

for(let i=1;i<arr.length;i++){
    if(arr[i]>largest){
        largest=[arr[i]];
    }
}
console.log(largest);