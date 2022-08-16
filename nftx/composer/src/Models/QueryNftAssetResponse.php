<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryNftAssetResponse extends Model
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

    // 藏品ID
    /**
     * @var string
     */
    public $nftId;

    // 藏品名称
    /**
     * @var string
     */
    public $skuName;

    // 藏品SKU ID
    /**
     * @var int
     */
    public $skuId;

    // 此藏品对应的uniHash值
    /**
     * @var string
     */
    public $uniHash;

    // 藏品铸造时间
    /**
     * @var string
     */
    public $creationTime;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'nftId'        => 'nft_id',
        'skuName'      => 'sku_name',
        'skuId'        => 'sku_id',
        'uniHash'      => 'uni_hash',
        'creationTime' => 'creation_time',
    ];

    public function validate()
    {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->uniHash) {
            $res['uni_hash'] = $this->uniHash;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNftAssetResponse
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
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }
        if (isset($map['sku_name'])) {
            $model->skuName = $map['sku_name'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['uni_hash'])) {
            $model->uniHash = $map['uni_hash'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }

        return $model;
    }
}
