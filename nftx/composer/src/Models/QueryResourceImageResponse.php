<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryResourceImageResponse extends Model
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

    // nftID 藏品素材nftId，type为NFT时有值
    /**
     * @var string
     */
    public $nftId;

    // 具体藏品名称，type为NFT时有值
    /**
     * @var string
     */
    public $skuName;

    // nftId 的 算法计算的hash，该藏品唯一标识，type为NFT时有值
    /**
     * @var string
     */
    public $uniHash;

    // Date	藏品铸造上链生成时间，例如2021.09.22 20:22:19，type为NFT时有值
    /**
     * @var string
     */
    public $creationTime;

    // 缩略图url列表
    /**
     * @var string[]
     */
    public $thumbnailUrls;

    // int	高清图状态
    // 0 需要等待
    // 1 已完成
    /**
     * @var int
     */
    public $highDefinitionStatus;

    // 在highDefinitionStatus为1时有值
    // 高清图列表
    /**
     * @var string
     */
    public $highDefinitionUrls;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'nftId'                => 'nft_id',
        'skuName'              => 'sku_name',
        'uniHash'              => 'uni_hash',
        'creationTime'         => 'creation_time',
        'thumbnailUrls'        => 'thumbnail_urls',
        'highDefinitionStatus' => 'high_definition_status',
        'highDefinitionUrls'   => 'high_definition_urls',
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
        if (null !== $this->uniHash) {
            $res['uni_hash'] = $this->uniHash;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->thumbnailUrls) {
            $res['thumbnail_urls'] = $this->thumbnailUrls;
        }
        if (null !== $this->highDefinitionStatus) {
            $res['high_definition_status'] = $this->highDefinitionStatus;
        }
        if (null !== $this->highDefinitionUrls) {
            $res['high_definition_urls'] = $this->highDefinitionUrls;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourceImageResponse
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
        if (isset($map['uni_hash'])) {
            $model->uniHash = $map['uni_hash'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['thumbnail_urls'])) {
            if (!empty($map['thumbnail_urls'])) {
                $model->thumbnailUrls = $map['thumbnail_urls'];
            }
        }
        if (isset($map['high_definition_status'])) {
            $model->highDefinitionStatus = $map['high_definition_status'];
        }
        if (isset($map['high_definition_urls'])) {
            $model->highDefinitionUrls = $map['high_definition_urls'];
        }

        return $model;
    }
}
