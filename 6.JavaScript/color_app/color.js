function colorChange(id){
  var cell = document.getElementById(id);
var index = cell.id;
var checked=false;

  var getColor = document.getElementsByName("button");
  for (var i = 0, length = getColor.length; i < length; i++){
    if(getColor[i].checked)
      checked=true;

  }

  if(checked){
    for (var i = 0, length = getColor.length; i < length; i++) {

          if(getColor[i].checked){

            var color = getColor[i].value;
            if(cell.style.backgroundColor=="red"||cell.style.backgroundColor=="blue"||cell.style.backgroundColor=="green"){
              alert("Color already applied, Please select a different cell");
              break;

            }
            cell.style.backgroundColor=color;


          }


    }

  }
  else{
    alert("Please select a color");

  }

}
function Reset() {

  for(var i = 1; i <=9; i++)
    {
      var cell = document.getElementById(i);
        cell.style.backgroundColor = "#eee";
        document.getElementById(i).innerHTML = i;
    }
  document.getElementById("colorNumber").reset();
}

function shuffle(){
  var temp1,temp2,temp3,temp4;
  for(i=1;i<=9;i++){
    var random =  Math.floor((Math.random() * 9) + 1);

    temp1=document.getElementById(i).innerHTML;
    temp2=document.getElementById(i).style.backgroundColor;
    temp3=document.getElementById(random).innerHTML;
    temp4=document.getElementById(random).style.backgroundColor;

    document.getElementById(random).innerHTML=temp1;
    document.getElementById(random).style.backgroundColor=temp2;
    document.getElementById(i).innerHTML=temp3;
    document.getElementById(i).style.backgroundColor=temp4;


  }




}
