<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateLogisticFinanceDisvcRequest extends Model
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

    // 指定可验证声明颁发对象的分布式数字身份id
    /**
     * @var string
     */
    public $destDid;

    // 可验证声明有效期 (时间戳) ， 到达该时间戳表示的时间时过期， 默认一天
    /**
     * @var string
     */
    public $expire;

    // vc颁发者分布式数字身份，缺省时为调用者的默认分布式数字身份
    /**
     * @var string
     */
    public $srcDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'destDid'           => 'dest_did',
        'expire'            => 'expire',
        'srcDid'            => 'src_did',
    ];

    public function validate()
    {
        Model::validateRequired('destDid', $this->destDid, true);
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
        if (null !== $this->destDid) {
            $res['dest_did'] = $this->destDid;
        }
        if (null !== $this->expire) {
            $res['expire'] = $this->expire;
        }
        if (null !== $this->srcDid) {
            $res['src_did'] = $this->srcDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLogisticFinanceDisvcRequest
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
        if (isset($map['dest_did'])) {
            $model->destDid = $map['dest_did'];
        }
        if (isset($map['expire'])) {
            $model->expire = $map['expire'];
        }
        if (isset($map['src_did'])) {
            $model->srcDid = $map['src_did'];
        }

        return $model;
    }
}
