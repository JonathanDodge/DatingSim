package engine;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class OpeningAnimationState extends State{
	
	private int counter, speed;
	private long timer, lastTime;
	
	private static BufferedImage f00 = ImageLoader.loadImage("/res/Animation/FadeUp_00.png"),
					 	  f01 = ImageLoader.loadImage("/res/Animation/FadeUp_01.png"),
						  f02 = ImageLoader.loadImage("/res/Animation/FadeUp_02.png"),
						  f03 = ImageLoader.loadImage("/res/Animation/FadeUp_03.png"),
						  f04 = ImageLoader.loadImage("/res/Animation/FadeUp_04.png"),
						  f05 = ImageLoader.loadImage("/res/Animation/FadeUp_05.png"),
						  f06 = ImageLoader.loadImage("/res/Animation/FadeUp_06.png"),
						  f07 = ImageLoader.loadImage("/res/Animation/FadeUp_07.png"),
						  f08 = ImageLoader.loadImage("/res/Animation/FadeUp_08.png"),
						  f09 = ImageLoader.loadImage("/res/Animation/FadeUp_09.png"),
						  f10 = ImageLoader.loadImage("/res/Animation/FadeUp_10.png"),
						  f11 = ImageLoader.loadImage("/res/Animation/FadeUp_11.png"),
						  f12 = ImageLoader.loadImage("/res/Animation/FadeUp_12.png"),
						  f13 = ImageLoader.loadImage("/res/Animation/FadeUp_13.png"),
						  f14 = ImageLoader.loadImage("/res/Animation/FadeUp_14.png"),
						  f15 = ImageLoader.loadImage("/res/Animation/FadeUp_15.png"),
			  	 	      f16 = ImageLoader.loadImage("/res/Animation/FadeUp_16.png"),
			   	   	      f17 = ImageLoader.loadImage("/res/Animation/FadeUp_17.png"),
						  Frame00 = ImageLoader.loadImage("/res/Animation/Frame_00.png"),
			Frame01 = ImageLoader.loadImage("/res/Animation/Frame_01.png"),
			Frame02 = ImageLoader.loadImage("/res/Animation/Frame_02.png"),
			Frame03 = ImageLoader.loadImage("/res/Animation/Frame_03.png"),
			Frame04 = ImageLoader.loadImage("/res/Animation/Frame_04.png"),
			Frame05 = ImageLoader.loadImage("/res/Animation/Frame_05.png"),
			Frame06 = ImageLoader.loadImage("/res/Animation/Frame_06.png"),
			Frame07 = ImageLoader.loadImage("/res/Animation/Frame_07.png"),
			Frame08 = ImageLoader.loadImage("/res/Animation/Frame_08.png"),
			Frame09 = ImageLoader.loadImage("/res/Animation/Frame_09.png"),
			Frame10 = ImageLoader.loadImage("/res/Animation/Frame_10.png"),
			Frame11 = ImageLoader.loadImage("/res/Animation/Frame_11.png"),
			Frame12 = ImageLoader.loadImage("/res/Animation/Frame_12.png"),
			Frame13 = ImageLoader.loadImage("/res/Animation/Frame_13.png"),
			Frame14 = ImageLoader.loadImage("/res/Animation/Frame_14.png"),
			Frame15 = ImageLoader.loadImage("/res/Animation/Frame_15.png"),
			Frame16 = ImageLoader.loadImage("/res/Animation/Frame_16.png"),
			Frame17 = ImageLoader.loadImage("/res/Animation/Frame_17.png"),
			Frame18 = ImageLoader.loadImage("/res/Animation/Frame_18.png"),
			Frame19 = ImageLoader.loadImage("/res/Animation/Frame_19.png"),
			Frame20 = ImageLoader.loadImage("/res/Animation/Frame_20.png"),
			Frame21 = ImageLoader.loadImage("/res/Animation/Frame_21.png"),
			Frame22 = ImageLoader.loadImage("/res/Animation/Frame_22.png"),
			Frame23 = ImageLoader.loadImage("/res/Animation/Frame_23.png"),
			Frame24 = ImageLoader.loadImage("/res/Animation/Frame_24.png"),
			Frame25 = ImageLoader.loadImage("/res/Animation/Frame_25.png"),
			Frame26 = ImageLoader.loadImage("/res/Animation/Frame_26.png"),
			Frame27 = ImageLoader.loadImage("/res/Animation/Frame_27.png"),
			Frame28 = ImageLoader.loadImage("/res/Animation/Frame_28.png"),
			Frame29 = ImageLoader.loadImage("/res/Animation/Frame_29.png"),
			Frame30 = ImageLoader.loadImage("/res/Animation/Frame_30.png"),
			Frame31 = ImageLoader.loadImage("/res/Animation/Frame_31.png"),
			Frame32 = ImageLoader.loadImage("/res/Animation/Frame_32.png"),
			Frame33 = ImageLoader.loadImage("/res/Animation/Frame_33.png"),
			Frame34 = ImageLoader.loadImage("/res/Animation/Frame_34.png"),
			Frame35 = ImageLoader.loadImage("/res/Animation/Frame_35.png"),
			Frame36 = ImageLoader.loadImage("/res/Animation/Frame_36.png"),
			Frame37 = ImageLoader.loadImage("/res/Animation/Frame_37.png"),
			Frame38 = ImageLoader.loadImage("/res/Animation/Frame_38.png"),
			Frame39 = ImageLoader.loadImage("/res/Animation/Frame_39.png"),
			Frame40 = ImageLoader.loadImage("/res/Animation/Frame_40.png"),
			Frame41 = ImageLoader.loadImage("/res/Animation/Frame_41.png"),
			Frame42 = ImageLoader.loadImage("/res/Animation/Frame_42.png"),
			Frame43 = ImageLoader.loadImage("/res/Animation/Frame_43.png"),
			Frame44 = ImageLoader.loadImage("/res/Animation/Frame_44.png"),
			Frame45 = ImageLoader.loadImage("/res/Animation/Frame_45.png"),
			Frame46 = ImageLoader.loadImage("/res/Animation/Frame_46.png"),
			Frame47 = ImageLoader.loadImage("/res/Animation/Frame_47.png"),
			Frame48 = ImageLoader.loadImage("/res/Animation/Frame_48.png"),
			Frame49 = ImageLoader.loadImage("/res/Animation/Frame_49.png");


	//49 FRAMES

	public OpeningAnimationState(Handler handler) {
		super(handler);
		speed = 60;
		
	}
	
	public void tick() {
		if(handler.getMouseManager().isLeftPressed()){
			State.setState(handler.getGame().menuState);
		}
		
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed){
			counter++;
			timer = 0;
			if(counter >= 189){ //14: load up copyright, 60: hold copyright, 14: fade to name, 60: hold name, 14:fade out name, 24: fade out animation
				State.setState(handler.getGame().menuState);
			}
		}
		
		
	}
	
	public void render(Graphics g) {
		g.drawImage(this.currentframe(), 0, 0, null);
		if(counter < 19 || counter > 169){
			g.drawImage(getFade(), 0, 0, null);
		}

	}
	private BufferedImage getFade(){
		switch(counter){
			case 1:
				return f00;
			case 2:
				return f01;
			case 3:
				return f02;
			case 4:
				return f03;
			case 5:
				return f04;
			case 6:
				return f05;
			case 7:
				return f06;
			case 8:
				return f07;
			case 9:
				return f08;
			case 10:
				return f09;
			case 11:
				return f10;
			case 12:
				return f11;
			case 13:
				return f12;
			case 14:
				return f13;
			case 15:
				return f14;
			case 16:
				return f15;
			case 17:
				return f16;
			case 18:
				return f17;
			default:
				return null;
		}
	}

	private BufferedImage currentframe(){
		switch(counter){
		case 1:
			return Frame00;
		case 2:
			return Frame01;
		case 3:
			return Frame02;
		case 4:
			return Frame03;
		case 5:
			return Frame04;
		case 6:
			return Frame05;
		case 7:
			return Frame06;
		case 8:
			return Frame07;
		case 9:
			return Frame08;
		case 10:
			return Frame09;
		case 11:
			return Frame10;
		case 12:
			return Frame11;
		case 13:
			return Frame12;
		case 14:
			return Frame13;
		case 15:
			return Frame14;
		case 16:
			return Frame15;
		case 17:
			return Frame16;
		case 18:
			return Frame17;
		case 19:
			return Frame18;
		case 20:
			return Frame19;
		case 21:
			return Frame20;
		case 22:
			return Frame21;
		case 23:
			return Frame22;
		case 24:
			return Frame23;
		case 25:
			return Frame24;
		case 26:
			return Frame25;
		case 27:
			return Frame26;
		case 28:
			return Frame27;
		case 29:
			return Frame28;
		case 30:
			return Frame29;
		case 31:
			return Frame30;
		case 32:
			return Frame31;
		case 33:
			return Frame32;
		case 34:
			return Frame33;
		case 35:
			return Frame34;
		case 36:
			return Frame35;
		case 37:
			return Frame36;
		case 38:
			return Frame37;
		case 39:
			return Frame38;
		case 40:
			return Frame40;
		case 41:
			return Frame41;
		case 42:
			return Frame42;
		case 43:
			return Frame43;
		case 44:
			return Frame44;
		case 45:
			return Frame45;
		case 46:
			return Frame46;
		case 47:
			return Frame47;
		case 48:
			return Frame48;
		case 49:
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
		case 60:
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
		case 80:
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
		case 101:
		case 102:
		case 103:
		case 104:
		case 105:
		case 106:
		case 107:
		case 108:
		case 109:
		case 110:
		case 111:
		case 112:
		case 113:
		case 114:
		case 115:
		case 116:
		case 117:
		case 118:
		case 119:
		case 120:
		case 121:
		case 122:
		case 123:
		case 124:
		case 125:
		case 126:
		case 127:
		case 128:
		case 129:
		case 130:
		case 131:
		case 132:
		case 133:
		case 134:
		case 135:
		case 136:
		case 137:
		case 138:
		case 139:
		case 140:
		case 141:
		case 142:
		case 143:
		case 144:
		case 145:
		case 146:
		case 147:
		case 148:
		case 149:
		case 150:
		case 151:
		case 152:
		case 153:
		case 154:
		case 155:
		case 156:
		case 157:
		case 158:
		case 159:
		case 160:
		case 161:
		case 162:
		case 163:
		case 164:
		case 165:
		case 166:
		case 167:
		case 168:
		case 169:
		case 170:
		case 171:
		case 172:
		case 173:
		case 174:
		case 175:
		case 176:
		case 177:
		case 178:
		case 179:
		case 180:
		case 181:
		case 182:
		case 183:
		case 184:
		case 185:
		case 186:
		case 187:
		case 188:
			return Frame49;
		default:
			return Frame49;
		}
	}

}
