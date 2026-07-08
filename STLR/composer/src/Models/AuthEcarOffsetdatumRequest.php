<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AuthEcarOffsetdatumRequest extends Model
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

    // 会员在蚂蚁DIS服务的账户DID
    /**
     * @var string
     */
    public $accountDid;

    // 碳普惠平台编码，如蚂蚁森林编码为Antforest
    /**
     * @var string
     */
    public $carbonOffsetPlatformNo;

    // 平台方会员账户ID
    /**
     * @var string
     */
    public $platformAccountId;

    // 授权关键数据列表，KV结构列表
    /**
     * @var AnyKeywordItem[]
     */
    public $authKeywordList;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'accountDid'             => 'account_did',
        'carbonOffsetPlatformNo' => 'carbon_offset_platform_no',
        'platformAccountId'      => 'platform_account_id',
        'authKeywordList'        => 'auth_keyword_list',
    ];

    public function validate()
    {
        Model::validateRequired('accountDid', $this->accountDid, true);
        Model::validateRequired('carbonOffsetPlatformNo', $this->carbonOffsetPlatformNo, true);
        Model::validateRequired('platformAccountId', $this->platformAccountId, true);
        Model::validateRequired('authKeywordList', $this->authKeywordList, true);
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
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->carbonOffsetPlatformNo) {
            $res['carbon_offset_platform_no'] = $this->carbonOffsetPlatformNo;
        }
        if (null !== $this->platformAccountId) {
            $res['platform_account_id'] = $this->platformAccountId;
        }
        if (null !== $this->authKeywordList) {
            $res['auth_keyword_list'] = [];
            if (null !== $this->authKeywordList && \is_array($this->authKeywordList)) {
                $n = 0;
                foreach ($this->authKeywordList as $item) {
                    $res['auth_keyword_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthEcarOffsetdatumRequest
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
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['carbon_offset_platform_no'])) {
            $model->carbonOffsetPlatformNo = $map['carbon_offset_platform_no'];
        }
        if (isset($map['platform_account_id'])) {
            $model->platformAccountId = $map['platform_account_id'];
        }
        if (isset($map['auth_keyword_list'])) {
            if (!empty($map['auth_keyword_list'])) {
                $model->authKeywordList = [];
                $n                      = 0;
                foreach ($map['auth_keyword_list'] as $item) {
                    $model->authKeywordList[$n++] = null !== $item ? AnyKeywordItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
