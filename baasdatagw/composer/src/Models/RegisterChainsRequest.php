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

    // Aldaba 链节点地址
    /**
     * @var string[]
     */
    public $aldabaNodes;

    // Aldaba 链使用的协议，支持 WebSocket / Tcp; 默认 WebSocket
    /**
     * @var string
     */
    public $aldabaNetworkProtocol;

    // Aldaba 链base64编码的JDS
    /**
     * @var string
     */
    public $aldabaTlsRootTruststore;

    // Aldaba 链 JDS 密码
    /**
     * @var string
     */
    public $aldabaTlsRootTruststorePassword;

    // Aldaba 链 base64编码的证书
    /**
     * @var string
     */
    public $aldabaTlsClientCertificate;

    // Aldaba 链 base64编码的密钥
    /**
     * @var string
     */
    public $aldabaTlsClientKey;

    // Aldaba 链密钥密码
    /**
     * @var string
     */
    public $aldabaTlsClientKeyPassword;

    // Aldaba 链 base64 编码的 sender 密钥
    /**
     * @var string
     */
    public $aldabaSenderKey;

    // Aldaba 链 sender 密钥的密码
    /**
     * @var string
     */
    public $aldabaSenderKeyPassword;
    protected $_name = [
        'authToken'                       => 'auth_token',
        'productInstanceId'               => 'product_instance_id',
        'bizId'                           => 'biz_id',
        'ver'                             => 'ver',
        'type'                            => 'type',
        'mychainNodes'                    => 'mychain_nodes',
        'mychainType'                     => 'mychain_type',
        'mychainTruststore'               => 'mychain_truststore',
        'mychainTruststorePassword'       => 'mychain_truststore_password',
        'mychainClientCrt'                => 'mychain_client_crt',
        'mychainClientKey'                => 'mychain_client_key',
        'mychainClientKeyPwd'             => 'mychain_client_key_pwd',
        'mychainTlsAlgo'                  => 'mychain_tls_algo',
        'mychainIdentityAlgo'             => 'mychain_identity_algo',
        'mychainGroupid'                  => 'mychain_groupid',
        'mychainParentBizid'              => 'mychain_parent_bizid',
        'aldabaNodes'                     => 'aldaba_nodes',
        'aldabaNetworkProtocol'           => 'aldaba_network_protocol',
        'aldabaTlsRootTruststore'         => 'aldaba_tls_root_truststore',
        'aldabaTlsRootTruststorePassword' => 'aldaba_tls_root_truststore_password',
        'aldabaTlsClientCertificate'      => 'aldaba_tls_client_certificate',
        'aldabaTlsClientKey'              => 'aldaba_tls_client_key',
        'aldabaTlsClientKeyPassword'      => 'aldaba_tls_client_key_password',
        'aldabaSenderKey'                 => 'aldaba_sender_key',
        'aldabaSenderKeyPassword'         => 'aldaba_sender_key_password',
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
        if (null !== $this->aldabaNodes) {
            $res['aldaba_nodes'] = $this->aldabaNodes;
        }
        if (null !== $this->aldabaNetworkProtocol) {
            $res['aldaba_network_protocol'] = $this->aldabaNetworkProtocol;
        }
        if (null !== $this->aldabaTlsRootTruststore) {
            $res['aldaba_tls_root_truststore'] = $this->aldabaTlsRootTruststore;
        }
        if (null !== $this->aldabaTlsRootTruststorePassword) {
            $res['aldaba_tls_root_truststore_password'] = $this->aldabaTlsRootTruststorePassword;
        }
        if (null !== $this->aldabaTlsClientCertificate) {
            $res['aldaba_tls_client_certificate'] = $this->aldabaTlsClientCertificate;
        }
        if (null !== $this->aldabaTlsClientKey) {
            $res['aldaba_tls_client_key'] = $this->aldabaTlsClientKey;
        }
        if (null !== $this->aldabaTlsClientKeyPassword) {
            $res['aldaba_tls_client_key_password'] = $this->aldabaTlsClientKeyPassword;
        }
        if (null !== $this->aldabaSenderKey) {
            $res['aldaba_sender_key'] = $this->aldabaSenderKey;
        }
        if (null !== $this->aldabaSenderKeyPassword) {
            $res['aldaba_sender_key_password'] = $this->aldabaSenderKeyPassword;
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
        if (isset($map['aldaba_nodes'])) {
            if (!empty($map['aldaba_nodes'])) {
                $model->aldabaNodes = $map['aldaba_nodes'];
            }
        }
        if (isset($map['aldaba_network_protocol'])) {
            $model->aldabaNetworkProtocol = $map['aldaba_network_protocol'];
        }
        if (isset($map['aldaba_tls_root_truststore'])) {
            $model->aldabaTlsRootTruststore = $map['aldaba_tls_root_truststore'];
        }
        if (isset($map['aldaba_tls_root_truststore_password'])) {
            $model->aldabaTlsRootTruststorePassword = $map['aldaba_tls_root_truststore_password'];
        }
        if (isset($map['aldaba_tls_client_certificate'])) {
            $model->aldabaTlsClientCertificate = $map['aldaba_tls_client_certificate'];
        }
        if (isset($map['aldaba_tls_client_key'])) {
            $model->aldabaTlsClientKey = $map['aldaba_tls_client_key'];
        }
        if (isset($map['aldaba_tls_client_key_password'])) {
            $model->aldabaTlsClientKeyPassword = $map['aldaba_tls_client_key_password'];
        }
        if (isset($map['aldaba_sender_key'])) {
            $model->aldabaSenderKey = $map['aldaba_sender_key'];
        }
        if (isset($map['aldaba_sender_key_password'])) {
            $model->aldabaSenderKeyPassword = $map['aldaba_sender_key_password'];
        }

        return $model;
    }
}
