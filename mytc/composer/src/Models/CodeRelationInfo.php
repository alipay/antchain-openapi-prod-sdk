<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class CodeRelationInfo extends Model
{
    // 溯源码，代表该账户的唯一资源标识
    /**
     * @example http://taobao.com/12345
     *
     * @var string
     */
    public $code;

    // 状态,客户自定义状态，用于过滤查询使用，仅支持字母数字构成
    //
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $status;

    // 关联内容
    /**
     * @example {"cipher": "123456"}
     *
     * @var string
     */
    public $content;

    // 区块链上交易哈希
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $txHash;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
    /**
     * @example 1654570807000
     *
     * @var string[]
     */
    public $bizLabels;

    // 溯源码信息关联记录唯一标识
    /**
     * @example 2ba028918edd6566fd0674dd33fc5e53b72c8e33439562e1598d1bdab341b0f1
     *
     * @var string
     */
    public $uniqueId;
    protected $_name = [
        'code'      => 'code',
        'status'    => 'status',
        'content'   => 'content',
        'txHash'    => 'tx_hash',
        'bizLabels' => 'biz_labels',
        'uniqueId'  => 'unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->bizLabels) {
            $res['biz_labels'] = $this->bizLabels;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CodeRelationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['biz_labels'])) {
            if (!empty($map['biz_labels'])) {
                $model->bizLabels = $map['biz_labels'];
            }
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }

        return $model;
    }
}
