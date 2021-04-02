<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DidBaseQueryResp extends Model
{
    // 授权水平，0-默认关联授权
    /**
     * @example 0
     *
     * @var int
     */
    public $authLevel;

    // 证书公钥，特定实体可查询
    /**
     * @example ""
     *
     * @var string
     */
    public $certPublicKey;

    // 证书文本，特定实体可以查询
    /**
     * @example “”
     *
     * @var string
     */
    public $certText;

    // DID扩展，设备/企业组织/仓库/空间的解析同ThingExtraParams
    /**
     * @example ""
     *
     * @var string
     */
    public $didExtension;

    // did公钥，特定w3c did实体可查询
    /**
     * @example ""
     *
     * @var string
     */
    public $didPublicKey;

    // DID用户名，w3c did实体可查询
    /**
     * @example ""
     *
     * @var string
     */
    public $didUsername;

    // 所有者DID
    /**
     * @example "did:iot:xxxxx"
     *
     * @var string
     */
    public $ownerDid;

    // 实体附属空间列表，例如仓库下属库位，设备关联库位等
    /**
     * @example ["",""]
     *
     * @var string[]
     */
    public $spacesAttached;

    // 实体附属实体列表，例如空间关联设备列表
    /**
     * @example ["",""]
     *
     * @var string[]
     */
    public $thingsAttached;

    // 实体属性，在阿里云iot设备，对应三元组
    /**
     * @example ",,"
     *
     * @var string
     */
    public $thingAttribute;

    // 原始ID
    /**
     * @example "原始ID"
     *
     * @var string
     */
    public $thingId;

    // 实体物模型id
    /**
     * @example ""
     *
     * @var string
     */
    public $thingModelId;

    // 服务端点，可实现w3c service endpoint
    /**
     * @example ""
     *
     * @var string
     */
    public $thingServiceEndpoint;

    // 设备状态需要是通过 updateStatus api更新，
    // 其他状态通过updateThingsDid api更新
    /**
     * @example 实体状态
     *
     * @var string
     */
    public $thingStatus;

    // 实体类型，注册时候的类型
    // 0: 阿里云设备
    // 1: 链机设备
    // 2: MCU设备
    // 3: INTEL设备
    // 16384:  默认设备
    // 65536: 组织身份
    // 131072: 仓库身份
    // 196608: 空间身份
    /**
     * @example 0
     *
     * @var int
     */
    public $thingType;

    // 实体版本
    /**
     * @example "1.0.0"
     *
     * @var string
     */
    public $thingVersion;

    // 使用者DID列表
    /**
     * @example ["did:iot:xxxxx","did:iot:yyyyy"]
     *
     * @var string[]
     */
    public $userDidList;

    // 查询的did
    /**
     * @example "did:iot:xxxx"
     *
     * @var string
     */
    public $did;
    protected $_name = [
        'authLevel'            => 'auth_level',
        'certPublicKey'        => 'cert_public_key',
        'certText'             => 'cert_text',
        'didExtension'         => 'did_extension',
        'didPublicKey'         => 'did_public_key',
        'didUsername'          => 'did_username',
        'ownerDid'             => 'owner_did',
        'spacesAttached'       => 'spaces_attached',
        'thingsAttached'       => 'things_attached',
        'thingAttribute'       => 'thing_attribute',
        'thingId'              => 'thing_id',
        'thingModelId'         => 'thing_model_id',
        'thingServiceEndpoint' => 'thing_service_endpoint',
        'thingStatus'          => 'thing_status',
        'thingType'            => 'thing_type',
        'thingVersion'         => 'thing_version',
        'userDidList'          => 'user_did_list',
        'did'                  => 'did',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authLevel) {
            $res['auth_level'] = $this->authLevel;
        }
        if (null !== $this->certPublicKey) {
            $res['cert_public_key'] = $this->certPublicKey;
        }
        if (null !== $this->certText) {
            $res['cert_text'] = $this->certText;
        }
        if (null !== $this->didExtension) {
            $res['did_extension'] = $this->didExtension;
        }
        if (null !== $this->didPublicKey) {
            $res['did_public_key'] = $this->didPublicKey;
        }
        if (null !== $this->didUsername) {
            $res['did_username'] = $this->didUsername;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }
        if (null !== $this->spacesAttached) {
            $res['spaces_attached'] = $this->spacesAttached;
        }
        if (null !== $this->thingsAttached) {
            $res['things_attached'] = $this->thingsAttached;
        }
        if (null !== $this->thingAttribute) {
            $res['thing_attribute'] = $this->thingAttribute;
        }
        if (null !== $this->thingId) {
            $res['thing_id'] = $this->thingId;
        }
        if (null !== $this->thingModelId) {
            $res['thing_model_id'] = $this->thingModelId;
        }
        if (null !== $this->thingServiceEndpoint) {
            $res['thing_service_endpoint'] = $this->thingServiceEndpoint;
        }
        if (null !== $this->thingStatus) {
            $res['thing_status'] = $this->thingStatus;
        }
        if (null !== $this->thingType) {
            $res['thing_type'] = $this->thingType;
        }
        if (null !== $this->thingVersion) {
            $res['thing_version'] = $this->thingVersion;
        }
        if (null !== $this->userDidList) {
            $res['user_did_list'] = $this->userDidList;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidBaseQueryResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_level'])) {
            $model->authLevel = $map['auth_level'];
        }
        if (isset($map['cert_public_key'])) {
            $model->certPublicKey = $map['cert_public_key'];
        }
        if (isset($map['cert_text'])) {
            $model->certText = $map['cert_text'];
        }
        if (isset($map['did_extension'])) {
            $model->didExtension = $map['did_extension'];
        }
        if (isset($map['did_public_key'])) {
            $model->didPublicKey = $map['did_public_key'];
        }
        if (isset($map['did_username'])) {
            $model->didUsername = $map['did_username'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }
        if (isset($map['spaces_attached'])) {
            if (!empty($map['spaces_attached'])) {
                $model->spacesAttached = $map['spaces_attached'];
            }
        }
        if (isset($map['things_attached'])) {
            if (!empty($map['things_attached'])) {
                $model->thingsAttached = $map['things_attached'];
            }
        }
        if (isset($map['thing_attribute'])) {
            $model->thingAttribute = $map['thing_attribute'];
        }
        if (isset($map['thing_id'])) {
            $model->thingId = $map['thing_id'];
        }
        if (isset($map['thing_model_id'])) {
            $model->thingModelId = $map['thing_model_id'];
        }
        if (isset($map['thing_service_endpoint'])) {
            $model->thingServiceEndpoint = $map['thing_service_endpoint'];
        }
        if (isset($map['thing_status'])) {
            $model->thingStatus = $map['thing_status'];
        }
        if (isset($map['thing_type'])) {
            $model->thingType = $map['thing_type'];
        }
        if (isset($map['thing_version'])) {
            $model->thingVersion = $map['thing_version'];
        }
        if (isset($map['user_did_list'])) {
            if (!empty($map['user_did_list'])) {
                $model->userDidList = $map['user_did_list'];
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
