<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotifyCmportLogisticsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 融资编号
    //
    /**
     * @var string
     */
    public $financialNo;

    // 货权编号
    //
    /**
     * @var string
     */
    public $cargoRightNo;

    // 获物品名
    //
    /**
     * @var string
     */
    public $goodsTypeName;

    // 运输条款
    //
    /**
     * @var string
     */
    public $transitClause;

    // 箱子数量
    //
    /**
     * @var int
     */
    public $boxNum;

    // 箱型
    //
    /**
     * @var string
     */
    public $boxType;

    // 运单信息详情列表
    /**
     * @var OrderInfo[]
     */
    public $orderInfoList;

    // 上链账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // 渠道名称
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'financialNo'       => 'financial_no',
        'cargoRightNo'      => 'cargo_right_no',
        'goodsTypeName'     => 'goods_type_name',
        'transitClause'     => 'transit_clause',
        'boxNum'            => 'box_num',
        'boxType'           => 'box_type',
        'orderInfoList'     => 'order_info_list',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('cargoRightNo', $this->cargoRightNo, true);
        Model::validateRequired('goodsTypeName', $this->goodsTypeName, true);
        Model::validateRequired('transitClause', $this->transitClause, true);
        Model::validateRequired('boxNum', $this->boxNum, true);
        Model::validateRequired('orderInfoList', $this->orderInfoList, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->cargoRightNo) {
            $res['cargo_right_no'] = $this->cargoRightNo;
        }
        if (null !== $this->goodsTypeName) {
            $res['goods_type_name'] = $this->goodsTypeName;
        }
        if (null !== $this->transitClause) {
            $res['transit_clause'] = $this->transitClause;
        }
        if (null !== $this->boxNum) {
            $res['box_num'] = $this->boxNum;
        }
        if (null !== $this->boxType) {
            $res['box_type'] = $this->boxType;
        }
        if (null !== $this->orderInfoList) {
            $res['order_info_list'] = [];
            if (null !== $this->orderInfoList && \is_array($this->orderInfoList)) {
                $n = 0;
                foreach ($this->orderInfoList as $item) {
                    $res['order_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyCmportLogisticsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['cargo_right_no'])) {
            $model->cargoRightNo = $map['cargo_right_no'];
        }
        if (isset($map['goods_type_name'])) {
            $model->goodsTypeName = $map['goods_type_name'];
        }
        if (isset($map['transit_clause'])) {
            $model->transitClause = $map['transit_clause'];
        }
        if (isset($map['box_num'])) {
            $model->boxNum = $map['box_num'];
        }
        if (isset($map['box_type'])) {
            $model->boxType = $map['box_type'];
        }
        if (isset($map['order_info_list'])) {
            if (!empty($map['order_info_list'])) {
                $model->orderInfoList = [];
                $n                    = 0;
                foreach ($map['order_info_list'] as $item) {
                    $model->orderInfoList[$n++] = null !== $item ? OrderInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
