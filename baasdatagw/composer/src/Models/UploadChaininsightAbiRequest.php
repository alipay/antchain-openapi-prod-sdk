<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class UploadChaininsightAbiRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizId;

    // 链上地址
    /**
     * @var string
     */
    public $hexAddress;

    // 对应的合约版本
    /**
     * @var string
     */
    public $ver;

    // ABI文件原始内容
    /**
     * @var string
     */
    public $file;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'hexAddress'        => 'hex_address',
        'ver'               => 'ver',
        'file'              => 'file',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('hexAddress', $this->hexAddress, true);
        Model::validateRequired('ver', $this->ver, true);
        Model::validateRequired('file', $this->file, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->hexAddress) {
            $res['hex_address'] = $this->hexAddress;
        }
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }
        if (null !== $this->file) {
            $res['file'] = $this->file;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadChaininsightAbiRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['hex_address'])) {
            $model->hexAddress = $map['hex_address'];
        }
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }
        if (isset($map['file'])) {
            $model->file = $map['file'];
        }

        return $model;
    }
}
