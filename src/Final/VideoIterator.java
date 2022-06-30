package Final;

import iterator.VideoItem;

public class VideoIterator {
	VideoItem[] itens;
	int posicao = 0;
	
	public VideoIterator(VideoItem[] itens) {
		this.itens = itens;
	}

	public Object next() {
		VideoItem videoItem = itens[posicao];
		posicao++;
		return videoItem;
	}

	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}
}
