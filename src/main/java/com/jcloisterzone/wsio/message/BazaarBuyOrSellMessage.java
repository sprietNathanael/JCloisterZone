package com.jcloisterzone.wsio.message;

import com.jcloisterzone.wsio.WsMessageCommand;

@WsMessageCommand("BAZAAR_BUY_OR_SELL")
public class BazaarBuyOrSellMessage implements WsInGameMessage, WsReplayableMessage {

    //TODO move to own file (and probably action package)
    public enum BuyOrSellOption { BUY, SELL }

    private String gameId;
    private BuyOrSellOption value;

    public BazaarBuyOrSellMessage() {
    }

    public BazaarBuyOrSellMessage(BuyOrSellOption value) {
        this.value = value;
    }

    @Override
    public String getGameId() {
        return gameId;
    }

    @Override
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public BuyOrSellOption getValue() {
        return value;
    }

    public void setValue(BuyOrSellOption value) {
        this.value = value;
    }


}
