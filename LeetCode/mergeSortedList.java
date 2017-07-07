void mergeSortedList(int[] arr1, int[] arr2, int originalLength1){
	int length1 = arr1.length;
	int length2 = arr2.length;
	int i = originalLength1 - 1;    // Iterator of the first array starting from the first int of the right side
	int j = length1 - 1;			// Iterator of the first array starting from the first empty element
	int k = length2 - 1;			// Iterator fo the second array starting from the last element

	while(i >= 0 && k >= 0){
		if(arr1[i] >= arr2[k]){
			arr1[j] = arr1[i];
			i--;
			j--;
		}
		else {
			arr1[j] = arr2[k];
			k--;
			j--;
		}
	}

	while(k >= 0){
		arr1[j] = arr2[k];
		k--;
		j--;
	}

	return;

}