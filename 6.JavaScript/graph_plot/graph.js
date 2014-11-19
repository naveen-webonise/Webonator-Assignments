
var equation,steps,inbound,outbound,steps_regex,eqn_regex,inbound_regex,outbound_regex,y,x,c_x,c_y;
var a,b;


    function check_input() {


      equation = document.getElementById("equation").value;
      steps = parseInt(document.getElementById("steps").value);
      inbound = parseInt(document.getElementById("inbound").value);
      outbound = parseInt(document.getElementById("outbound").value);

      steps_regex = /([0-9]+)/;
      eqn_regex = /([a-z]\s*[=]\s*[+|-]?[0-9]*[a-z][+|-]\s*[0-9]*)/;
      inbound_regex = /([+|-]?[0-9]+)/;
      outbound_regex = /([+|-]?[0-9]+)/;

      var steps_result = steps_regex.exec(steps);
      var eqn_result = eqn_regex.exec(equation);
      var inbound_result = inbound_regex.exec(inbound);
      var outbound_result = outbound_regex.exec(outbound);

      if(steps_result==null || eqn_result==null || inbound_result==null|| outbound_result==null){
        alert("Please enter a valid input");
      }
      else{







          var canvas = document.getElementById('myCanvas');
          var context = canvas.getContext('2d');


          context.beginPath();
          context.moveTo(0,canvas.height/2);
          context.lineTo(canvas.width,canvas.height/2);
          context.stroke();
          context.beginPath();
          context.moveTo(canvas.width/2,0);
          context.lineTo(canvas.width/2,canvas.height);
          context.stroke();

          y=b*x+a;
          x=inbound;


          if(x<0 && y>0 || x>0 && y<0){
            context.translate(canvas.width/2,canvas.height/2);
            context.rotate(90*Math.PI/180);
          }
          else{
            context.translate(canvas.width/2,canvas.height/2);
            context.rotate(-90*Math.PI/180);
          }




    equation = equation.replace(/\s/g,' ');
    var equationArray = equation.split("=");
    var equationRightSide = equationArray[1];
    var equationRightSideValues = equationRightSide.split(/[a-z]/);
    var c = equationRightSideValues[1];
     c = c.replace(/\s/g,' ');
     a = parseInt(c) ;

    var m = equationRightSideValues[0];
    m=m.replace(/\s/g,' ');


     b = parseInt(m);


          plot(a,b,x);
          return;

}




    }
    function plot(a,b,x){

      while((x+steps)<=outbound){


        y=b*x+a;
        c_x=x+steps;
        c_y=b*(c_x)+a;



        var canvas = document.getElementById('myCanvas');
        var context = canvas.getContext('2d');

        var radius = 2;
        var coordinates = "("+c_x+","+c_y+")";

        context.beginPath();
        context.arc(c_x,c_y,radius,0,2*Math.PI,false);
        context.fillStyle = 'green';
        context.fill();
        context.textAlign='left';
        context.fillText(coordinates,c_x,c_y);
        context.stroke();


        context.beginPath();
        context.moveTo(x,y);
        context.lineTo(c_x,c_y);
        context.stroke();
        x=c_x;
        plot(a,b,x);

      }



    }
