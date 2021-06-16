<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryNftCreateResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // NFT发行成功的商品id
    /**
     * @var string
     */
    public $skuId;

    // INIT("INIT", "初始化"),
    // PROCESSING("PROCESSING", "资产创建中"),
    // FINISH("FINISH", "资产初始化完毕"),
    // ;
    /**
     * @var string
     */
    public $skuStatus;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'skuId'      => 'sku_id',
        'skuStatus'  => 'sku_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->skuStatus) {
            $res['sku_status'] = $this->skuStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNftCreateResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['sku_status'])) {
            $model->skuStatus = $map['sku_status'];
        }

        return $model;
    }
}
