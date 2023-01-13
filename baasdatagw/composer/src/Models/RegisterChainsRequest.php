<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class RegisterChainsRequest extends Model
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

    // 链唯一标识符
    /**
     * @var string
     */
    public $bizId;

    // 链配置的最后更新时间（用于标识版本）
    /**
     * @var int
     */
    public $ver;

    // 链类型
    /**
     * @var string
     */
    public $type;

    // 节点RPC接口地址
    /**
     * @var string[]
     */
    public $mychainNodes;

    // MyChain版本
    /**
     * @var string
     */
    public $mychainType;

    // base64编码的JDS
    /**
     * @var string
     */
    public $mychainTruststore;

    // -
    /**
     * @var string
     */
    public $mychainTruststorePassword;

    // -
    /**
     * @var string
     */
    public $mychainClientCrt;

    // -
    /**
     * @var string
     */
    public $mychainClientKey;

    // -
    /**
     * @var string
     */
    public $mychainClientKeyPwd;

    // -
    /**
     * @var string
     */
    public $mychainTlsAlgo;

    // -
    /**
     * @var string
     */
    public $mychainIdentityAlgo;

    // 子链 groupID
    /**
     * @var string
     */
    public $mychainGroupid;

    // 子链的父链ID
    /**
     * @var string
     */
    public $mychainParentBizid;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'bizId'                     => 'biz_id',
        'ver'                       => 'ver',
        'type'                      => 'type',
        'mychainNodes'              => 'mychain_nodes',
        'mychainType'               => 'mychain_type',
        'mychainTruststore'         => 'mychain_truststore',
        'mychainTruststorePassword' => 'mychain_truststore_password',
        'mychainClientCrt'          => 'mychain_client_crt',
        'mychainClientKey'          => 'mychain_client_key',
        'mychainClientKeyPwd'       => 'mychain_client_key_pwd',
        'mychainTlsAlgo'            => 'mychain_tls_algo',
        'mychainIdentityAlgo'       => 'mychain_identity_algo',
        'mychainGroupid'            => 'mychain_groupid',
        'mychainParentBizid'        => 'mychain_parent_bizid',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('ver', $this->ver, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->mychainNodes) {
            $res['mychain_nodes'] = $this->mychainNodes;
        }
        if (null !== $this->mychainType) {
            $res['mychain_type'] = $this->mychainType;
        }
        if (null !== $this->mychainTruststore) {
            $res['mychain_truststore'] = $this->mychainTruststore;
        }
        if (null !== $this->mychainTruststorePassword) {
            $res['mychain_truststore_password'] = $this->mychainTruststorePassword;
        }
        if (null !== $this->mychainClientCrt) {
            $res['mychain_client_crt'] = $this->mychainClientCrt;
        }
        if (null !== $this->mychainClientKey) {
            $res['mychain_client_key'] = $this->mychainClientKey;
        }
        if (null !== $this->mychainClientKeyPwd) {
            $res['mychain_client_key_pwd'] = $this->mychainClientKeyPwd;
        }
        if (null !== $this->mychainTlsAlgo) {
            $res['mychain_tls_algo'] = $this->mychainTlsAlgo;
        }
        if (null !== $this->mychainIdentityAlgo) {
            $res['mychain_identity_algo'] = $this->mychainIdentityAlgo;
        }
        if (null !== $this->mychainGroupid) {
            $res['mychain_groupid'] = $this->mychainGroupid;
        }
        if (null !== $this->mychainParentBizid) {
            $res['mychain_parent_bizid'] = $this->mychainParentBizid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterChainsRequest
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
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['mychain_nodes'])) {
            if (!empty($map['mychain_nodes'])) {
                $model->mychainNodes = $map['mychain_nodes'];
            }
        }
        if (isset($map['mychain_type'])) {
            $model->mychainType = $map['mychain_type'];
        }
        if (isset($map['mychain_truststore'])) {
            $model->mychainTruststore = $map['mychain_truststore'];
        }
        if (isset($map['mychain_truststore_password'])) {
            $model->mychainTruststorePassword = $map['mychain_truststore_password'];
        }
        if (isset($map['mychain_client_crt'])) {
            $model->mychainClientCrt = $map['mychain_client_crt'];
        }
        if (isset($map['mychain_client_key'])) {
            $model->mychainClientKey = $map['mychain_client_key'];
        }
        if (isset($map['mychain_client_key_pwd'])) {
            $model->mychainClientKeyPwd = $map['mychain_client_key_pwd'];
        }
        if (isset($map['mychain_tls_algo'])) {
            $model->mychainTlsAlgo = $map['mychain_tls_algo'];
        }
        if (isset($map['mychain_identity_algo'])) {
            $model->mychainIdentityAlgo = $map['mychain_identity_algo'];
        }
        if (isset($map['mychain_groupid'])) {
            $model->mychainGroupid = $map['mychain_groupid'];
        }
        if (isset($map['mychain_parent_bizid'])) {
            $model->mychainParentBizid = $map['mychain_parent_bizid'];
        }

        return $model;
    }
}
