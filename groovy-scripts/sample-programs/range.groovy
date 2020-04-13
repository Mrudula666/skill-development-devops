def numbers = 1..10
 
for (number in numbers)
println number
println "-------------------------------"
def enum Days{
	MON,
	TUE,
	WEDNES,
	THURS,
	FRI,
	SAT,
	SUN
}

def days = Days.MON..Days.SUN
 for (day in days){
	println day
 }
 
 println "---------------------------"
 
println "Extens: "
println Days.From
println Days.To