<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartVcVcrepositoryWriteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 指定情况跟随 auth_did_list，如果auth_did_list不指定，则此字段无需指定，否则是与auth_did_list长度相同，并且对应auth_did_list的did的公钥加密AES密钥的结果
    /**
     * @var string[]
     */
    public $authAccessKeyList;

    // 配置此列表，则说明需要并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。 如果不配置此列表，则默认将明文存储此证书，任何did都可以访问此证书声明内容。
    /**
     * @var string[]
     */
    public $authDidList;

    // 写入VC数据的did，通常为证书VC的颁发者issuer的did。
    /**
     * @var string
     */
    public $did;

    // 对当前VC Repository操作的描述，signature字段需要包含此操作的描述，最终会记录在VC Repository连接的链上，可追溯此operation操作记录。
    /**
     * @var string
     */
    public $operation;

    // 写数据的did对应使用公钥做的数据签名，确保数据准确性。
    /**
     * @var string
     */
    public $signature;

    // 可验证声明的完整声明，其中claim字段可以已被加密保护 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义，可加密处理},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
    /**
     * @var string
     */
    public $vcContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authAccessKeyList' => 'auth_access_key_list',
        'authDidList'       => 'auth_did_list',
        'did'               => 'did',
        'operation'         => 'operation',
        'signature'         => 'signature',
        'vcContent'         => 'vc_content',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('vcContent', $this->vcContent, true);
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
        if (null !== $this->authAccessKeyList) {
            $res['auth_access_key_list'] = $this->authAccessKeyList;
        }
        if (null !== $this->authDidList) {
            $res['auth_did_list'] = $this->authDidList;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->vcContent) {
            $res['vc_content'] = $this->vcContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartVcVcrepositoryWriteRequest
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
        if (isset($map['auth_access_key_list'])) {
            if (!empty($map['auth_access_key_list'])) {
                $model->authAccessKeyList = $map['auth_access_key_list'];
            }
        }
        if (isset($map['auth_did_list'])) {
            if (!empty($map['auth_did_list'])) {
                $model->authDidList = $map['auth_did_list'];
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['vc_content'])) {
            $model->vcContent = $map['vc_content'];
        }

        return $model;
    }
}
