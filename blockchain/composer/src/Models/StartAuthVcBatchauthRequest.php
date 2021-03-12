<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVcBatchauthRequest extends Model
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    /**
     * @var string
     */
    public $bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    /**
     * @var string
     */
    public $bizType;

    // 批量进行可验证声明颁发的所有候选声明内容
    /**
     * @var Claim[]
     */
    public $claimList;

    // 非托管的情况下必选，业务方持有的did身份。
    /**
     * @var string
     */
    public $did;

    // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明。
    /**
     * @var string
     */
    public $extension;

    // jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe\r\nmx4xYCqX0gE=\r\n
    /**
     * @var string
     */
    public $signature;

    // 涉及的C类用户身份信息，如果是支付宝体系内，需要提供userId，并且提供二要素信息(name，certNo)
    /**
     * @var string
     */
    public $userInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'claimList'         => 'claim_list',
        'did'               => 'did',
        'extension'         => 'extension',
        'signature'         => 'signature',
        'userInfo'          => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('claimList', $this->claimList, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->claimList) {
            $res['claim_list'] = [];
            if (null !== $this->claimList && \is_array($this->claimList)) {
                $n = 0;
                foreach ($this->claimList as $item) {
                    $res['claim_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = $this->userInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVcBatchauthRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['claim_list'])) {
            if (!empty($map['claim_list'])) {
                $model->claimList = [];
                $n                = 0;
                foreach ($map['claim_list'] as $item) {
                    $model->claimList[$n++] = null !== $item ? Claim::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = $map['user_info'];
        }

        return $model;
    }
}
