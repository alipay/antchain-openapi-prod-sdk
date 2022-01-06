<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ImportDrmDrmresourcesRequest extends Model
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

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 上传类型。
    // data 表示上传带有推送值，空表示只传元数据
    /**
     * @var string
     */
    public $uploadType;

    // oss 上下载的地址
    /**
     * @var string
     */
    public $fileName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'uploadType'        => 'upload_type',
        'fileName'          => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('fileName', $this->fileName, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->uploadType) {
            $res['upload_type'] = $this->uploadType;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportDrmDrmresourcesRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['upload_type'])) {
            $model->uploadType = $map['upload_type'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
