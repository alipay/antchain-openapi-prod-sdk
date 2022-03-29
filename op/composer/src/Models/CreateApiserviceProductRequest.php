<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class CreateApiserviceProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 产品类型
    /**
     * @var string
     */
    public $type;

    // 产品英文名
    /**
     * @var string
     */
    public $name;

    // 产品中文名
    /**
     * @var string
     */
    public $chineseName;

    // 产品版本
    /**
     * @var string
     */
    public $prodVersion;

    // 产品所有者
    /**
     * @var string
     */
    public $primaryOwnerId;

    // 产品描述
    /**
     * @var string
     */
    public $description;

    // api提供方类型
    /**
     * @var string
     */
    public $providerType;

    // 产品前缀
    /**
     * @var string
     */
    public $apiNamePrefix;
    protected $_name = [
        'authToken'      => 'auth_token',
        'prodCode'       => 'prod_code',
        'type'           => 'type',
        'name'           => 'name',
        'chineseName'    => 'chinese_name',
        'prodVersion'    => 'prod_version',
        'primaryOwnerId' => 'primary_owner_id',
        'description'    => 'description',
        'providerType'   => 'provider_type',
        'apiNamePrefix'  => 'api_name_prefix',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('chineseName', $this->chineseName, true);
        Model::validateRequired('primaryOwnerId', $this->primaryOwnerId, true);
        Model::validateRequired('description', $this->description, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->prodVersion) {
            $res['prod_version'] = $this->prodVersion;
        }
        if (null !== $this->primaryOwnerId) {
            $res['primary_owner_id'] = $this->primaryOwnerId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->providerType) {
            $res['provider_type'] = $this->providerType;
        }
        if (null !== $this->apiNamePrefix) {
            $res['api_name_prefix'] = $this->apiNamePrefix;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateApiserviceProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['chinese_name'])) {
            $model->chineseName = $map['chinese_name'];
        }
        if (isset($map['prod_version'])) {
            $model->prodVersion = $map['prod_version'];
        }
        if (isset($map['primary_owner_id'])) {
            $model->primaryOwnerId = $map['primary_owner_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['provider_type'])) {
            $model->providerType = $map['provider_type'];
        }
        if (isset($map['api_name_prefix'])) {
            $model->apiNamePrefix = $map['api_name_prefix'];
        }

        return $model;
    }
}
