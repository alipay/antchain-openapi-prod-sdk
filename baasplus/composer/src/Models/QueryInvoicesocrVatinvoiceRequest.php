<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryInvoicesocrVatinvoiceRequest extends Model
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

    // 文件二进制内容 + base64
    /**
     * @var string
     */
    public $imageRaw;

    // 图片下载url
    /**
     * @var string
     */
    public $imageUrl;

    // 服务调用来源(需要咨询服务提供方)
    /**
     * @var string
     */
    public $source;

    // 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
    /**
     * @var string
     */
    public $traceId;

    // 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
    /**
     * @var string
     */
    public $fileType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'imageRaw'          => 'image_raw',
        'imageUrl'          => 'image_url',
        'source'            => 'source',
        'traceId'           => 'trace_id',
        'fileType'          => 'file_type',
    ];

    public function validate()
    {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('fileType', $this->fileType, true);
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
        if (null !== $this->imageRaw) {
            $res['image_raw'] = $this->imageRaw;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInvoicesocrVatinvoiceRequest
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
        if (isset($map['image_raw'])) {
            $model->imageRaw = $map['image_raw'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }

        return $model;
    }
}
