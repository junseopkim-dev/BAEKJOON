import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int videolength = txt2mins(video_len);
        int currentpos = txt2mins(pos);
        int bg_op = txt2mins(op_start);
        int ed_op = txt2mins(op_end);
        
        for (String com : commands){
            
            //오프닝 구간 생략
            if(currentpos>=bg_op && currentpos <=ed_op){
                currentpos = ed_op;
            }
            
            
            if(com.equals("next")){
                currentpos +=10;
            }
            else{
                currentpos -=10;
            }
            
            // 0 ~ 영상 길이 내에서 고정되도록
            
            if(currentpos <= 0){
                currentpos = 0;
            }
            else if(currentpos >= videolength){
                currentpos = videolength;
            }
            
            //오프닝 구간 생략
            if(currentpos>=bg_op && currentpos <=ed_op){
                currentpos = ed_op;
            }
            
            
            
        }
        
        //String으로 변환
        
        String hour_text = "00";
        String min_text = "00";
        
        
        if(currentpos/60 < 10){
            hour_text = "0"+String.valueOf(currentpos/60);
        }
        else{
            hour_text = String.valueOf(currentpos/60);
        }
        
        if(currentpos%60 <10){
            min_text = "0"+ String.valueOf(currentpos%60);
        }
        else{
            min_text = String.valueOf(currentpos%60);
        }
        
        
        
        
        
        
        String answer = hour_text + ":" + min_text;
        return answer;
    }
    
    public int txt2mins(String txtTime){
        int hh = 60*Integer.parseInt(txtTime.substring(0,2));
        int mm = Integer.parseInt(txtTime.substring(3,5));
        
        int mins = hh + mm;
        
        return mins;
    }
    
    
}