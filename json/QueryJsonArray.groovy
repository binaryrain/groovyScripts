/**
* Refer:
* 
**/
def json = """[
	{
		"Type": "Type1",
		"ID": "Name1",
		"Label": "Text1",
	},
	{
		"Type": "Type2",
		"ID": "Name2",
		"Label": "Text2",
	},
	{
		"Type": "Type3",
		"ID": "Name3",
		"Label": "Text3",
	}
]"""

def list = new groovy.json.JsonSlurper().parseText(json)
//find label when type is type3
println list.find{it.Type == 'Type3'}.Label
