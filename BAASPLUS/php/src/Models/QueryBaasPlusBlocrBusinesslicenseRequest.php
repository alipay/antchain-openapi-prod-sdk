<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusBlocrBusinesslicenseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'imageRaw' => 'image_raw',
        'imageUrl' => 'image_url',
        'source' => 'source',
        'traceId' => 'trace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusBlocrBusinesslicenseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['image_raw'])){
            $model->imageRaw = $map['image_raw'];
        }
        if(isset($map['image_url'])){
            $model->imageUrl = $map['image_url'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

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

}
