<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthAssetIssueRequest extends Model
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    /**
     * @var string
     */
    public $bizId;

    // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
    /**
     * @var string
     */
    public $bizType;

    // 目前区分content的两种数据：
    // - "b_total"：商户维度聚合数据，（分城市消费者统计数据），相关商家属性。
    // - "c_deposit"：C类个人充值数据，未来扩展C类核销，退款等数据类型，"c_"前缀。
    // - "c_total"：C类个人充值数据聚合(安心充+学费码整体去重按照地理位置维度聚合)
    /**
     * @var string
     */
    public $type;

    // 当 type参数为："b_total"
    // 主要设定“商户统一信用码” ，其name字段从mif如果获取到也填入：
    // {"name": "XXXX",
    // "certNo":"信用码"}，
    //
    // 当type参数为："c_deposit"时，设定C类用户信息，使用uid，如果有二要素信息，则计算二要素“姓名+身份证号”的拼接字符串计算Hash得到twoMeta：
    // {"userId": "XXXX",
    // "twoMeta":"SHA256(姓名+身份证号码)"}
    //
    // 当 type参数为："c_total"，可以不设定此参数。
    /**
     * @var string
     */
    public $identity;

    // 可能两种类型数据：
    // 商户维度的统计数据，是聚合的数据结果
    // C类充值数据，包含 充值明细数据，目标商户信用码，商户所在城市地理位置信息等。
    /**
     * @var string
     */
    public $content;

    // 传递的附加信息说明，暂时未定义
    /**
     * @var string
     */
    public $extension;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'type'              => 'type',
        'identity'          => 'identity',
        'content'           => 'content',
        'extension'         => 'extension',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthAssetIssueRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }

        return $model;
    }
}
