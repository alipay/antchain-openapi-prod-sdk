<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\GESAAS\Models\OrderSplitDetailList;

class OrderSplitInfo extends Model {
    protected $_name = [
        'orderSplitStatus' => 'order_split_status',
        'orderSplitAccountCount' => 'order_split_account_count',
        'orderSplitDetailList' => 'order_split_detail_list',
    ];
    public function validate() {
        Model::validateRequired('orderSplitStatus', $this->orderSplitStatus, true);
        Model::validateRequired('orderSplitAccountCount', $this->orderSplitAccountCount, true);
        Model::validateRequired('orderSplitDetailList', $this->orderSplitDetailList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orderSplitStatus) {
            $res['order_split_status'] = $this->orderSplitStatus;
        }
        if (null !== $this->orderSplitAccountCount) {
            $res['order_split_account_count'] = $this->orderSplitAccountCount;
        }
        if (null !== $this->orderSplitDetailList) {
            $res['order_split_detail_list'] = [];
            if(null !== $this->orderSplitDetailList && is_array($this->orderSplitDetailList)){
                $n = 0;
                foreach($this->orderSplitDetailList as $item){
                    $res['order_split_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderSplitInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_split_status'])){
            $model->orderSplitStatus = $map['order_split_status'];
        }
        if(isset($map['order_split_account_count'])){
            $model->orderSplitAccountCount = $map['order_split_account_count'];
        }
        if(isset($map['order_split_detail_list'])){
            if(!empty($map['order_split_detail_list'])){
                $model->orderSplitDetailList = [];
                $n = 0;
                foreach($map['order_split_detail_list'] as $item) {
                    $model->orderSplitDetailList[$n++] = null !== $item ? OrderSplitDetailList::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 主订单分账状态，PROCESSING-处理中,SUCCESS-成功,FAILED-失败
    /**
     * @example SUCCESS
     * @var string
     */
    public $orderSplitStatus;

    // 分账账号个数
    /**
     * @example 9
     * @var int
     */
    public $orderSplitAccountCount;

    // 分账账号详情，针对某一笔分账
    /**
     * @example undefined
     * @var OrderSplitDetailList[]
     */
    public $orderSplitDetailList;

}
