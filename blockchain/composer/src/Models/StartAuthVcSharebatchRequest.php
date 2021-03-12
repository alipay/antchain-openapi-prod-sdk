<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcSharebatchRequest extends Model
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

    // 非托管的情况下必选，业务方持有的did身份。
    /**
     * @var string
     */
    public $did;

    // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
    /**
     * @var string
     */
    public $signature;

    // 分享声明的目标方DID
    /**
     * @var string
     */
    public $targetDid;

    // 目标待分享的VC列表，不超过10个
    /**
     * @var VcShareStruct[]
     */
    public $vcShareList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'signature'         => 'signature',
        'targetDid'         => 'target_did',
        'vcShareList'       => 'vc_share_list',
    ];

    public function validate()
    {
        Model::validateRequired('targetDid', $this->targetDid, true);
        Model::validateRequired('vcShareList', $this->vcShareList, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->targetDid) {
            $res['target_did'] = $this->targetDid;
        }
        if (null !== $this->vcShareList) {
            $res['vc_share_list'] = [];
            if (null !== $this->vcShareList && \is_array($this->vcShareList)) {
                $n = 0;
                foreach ($this->vcShareList as $item) {
                    $res['vc_share_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcSharebatchRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['target_did'])) {
            $model->targetDid = $map['target_did'];
        }
        if (isset($map['vc_share_list'])) {
            if (!empty($map['vc_share_list'])) {
                $model->vcShareList = [];
                $n                  = 0;
                foreach ($map['vc_share_list'] as $item) {
                    $model->vcShareList[$n++] = null !== $item ? VcShareStruct::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
