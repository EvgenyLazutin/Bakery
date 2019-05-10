package service;


import model.packaging.Pack;
import model.payment.PriceQuantityPack;

interface CalculateOrder {

    PriceQuantityPack calculatePack(int quantity, Pack pack);
}
