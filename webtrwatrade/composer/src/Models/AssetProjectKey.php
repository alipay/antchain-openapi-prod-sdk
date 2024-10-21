<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class AssetProjectKey extends Model
{
    // 项目ID
    /**
     * @example f9146ccccf684db792a8fa10d876e22c
     *
     * @var string
     */
    public $projectId;

    // 项目名称
    /**
     * @example 充电桩
     *
     * @var string
     */
    public $projectName;

    // 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
    /**
     * @example MANAGER
     *
     * @var string
     */
    public $keyType;

    // 密钥ID
    /**
     * @example 1826615104029319169
     *
     * @var string
     */
    public $keyId;

    // 密钥名称
    /**
     * @example 管理密钥
     *
     * @var string
     */
    public $keyName;

    // 密钥地址
    /**
     * @example 0x74d6c42ad822cfb8de858ce60f3c6dab1e553698
     *
     * @var string
     */
    public $keyAddress;

    // 关联时间戳
    /**
     * @example 1726024364000
     *
     * @var int
     */
    public $correlationTime;
    protected $_name = [
        'projectId'       => 'project_id',
        'projectName'     => 'project_name',
        'keyType'         => 'key_type',
        'keyId'           => 'key_id',
        'keyName'         => 'key_name',
        'keyAddress'      => 'key_address',
        'correlationTime' => 'correlation_time',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('keyType', $this->keyType, true);
        Model::validateRequired('keyId', $this->keyId, true);
        Model::validateRequired('keyName', $this->keyName, true);
        Model::validateRequired('keyAddress', $this->keyAddress, true);
        Model::validateRequired('correlationTime', $this->correlationTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->keyType) {
            $res['key_type'] = $this->keyType;
        }
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->keyName) {
            $res['key_name'] = $this->keyName;
        }
        if (null !== $this->keyAddress) {
            $res['key_address'] = $this->keyAddress;
        }
        if (null !== $this->correlationTime) {
            $res['correlation_time'] = $this->correlationTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetProjectKey
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['key_type'])) {
            $model->keyType = $map['key_type'];
        }
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['key_name'])) {
            $model->keyName = $map['key_name'];
        }
        if (isset($map['key_address'])) {
            $model->keyAddress = $map['key_address'];
        }
        if (isset($map['correlation_time'])) {
            $model->correlationTime = $map['correlation_time'];
        }

        return $model;
    }
}
