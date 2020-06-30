<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UploadImageRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'contentType' => 'content_type',
        'delegatedTenantId' => 'delegated_tenant_id',
        'image' => 'image',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadImageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['content_type'])){
            $model->contentType = $map['content_type'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['image'])){
            $model->image = $map['image'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 图片MIME类型，目前仅支持 image/jpeg
     * @example image/jpeg
     * @var string
     */
    public $contentType;

    /**
     * @description 要代理操作的租户ID
     * @example delegated_tenant_id
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 图片信息（base64编码）
     * @example ...KwQkUzoq0toWc2DVXk3WurM+gvAuEM1kUb5wvVZHNeA=
     * @var string
     */
    public $image;

}
