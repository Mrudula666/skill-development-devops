def numbers = 1..10
 
for (number in numbers){
	if(isEven(number))
		println number
}

def isEven(def num){
	return (num%2 == 0)
}
