<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class UserBadgeVO extends Model
{
    // 用户徽章id
    /**
     * @example ACbenefit_1102_sitMbRNh
     *
     * @var string
     */
    public $poapId;

    // 徽章hash
    /**
     * @example 626e0599931e13142a84e8c7fe91215798ca8f67d012aff8e1265f7441983f7b
     *
     * @var string
     */
    public $poapIdHash;

    // 徽章图片
    /**
     * @example https://xxxx
     *
     * @var string
     */
    public $logoUrl;

    // 徽章名称
    /**
     * @example 三角徽章
     *
     * @var string
     */
    public $name;

    // 徽章简介
    /**
     * @example 活动徽章，其实也就是，便利店活动的兑换物品。
     *
     * @var string
     */
    public $introduction;

    // 品牌商名称
    /**
     * @example Kingston金士顿
     *
     * @var string
     */
    public $brandsName;

    // 公益机构名称
    /**
     * @example 公益机构
     *
     * @var string
     */
    public $orgName;
    protected $_name = [
        'poapId'       => 'poap_id',
        'poapIdHash'   => 'poap_id_hash',
        'logoUrl'      => 'logo_url',
        'name'         => 'name',
        'introduction' => 'introduction',
        'brandsName'   => 'brands_name',
        'orgName'      => 'org_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->poapId) {
            $res['poap_id'] = $this->poapId;
        }
        if (null !== $this->poapIdHash) {
            $res['poap_id_hash'] = $this->poapIdHash;
        }
        if (null !== $this->logoUrl) {
            $res['logo_url'] = $this->logoUrl;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->introduction) {
            $res['introduction'] = $this->introduction;
        }
        if (null !== $this->brandsName) {
            $res['brands_name'] = $this->brandsName;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserBadgeVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['poap_id'])) {
            $model->poapId = $map['poap_id'];
        }
        if (isset($map['poap_id_hash'])) {
            $model->poapIdHash = $map['poap_id_hash'];
        }
        if (isset($map['logo_url'])) {
            $model->logoUrl = $map['logo_url'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['introduction'])) {
            $model->introduction = $map['introduction'];
        }
        if (isset($map['brands_name'])) {
            $model->brandsName = $map['brands_name'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }

        return $model;
    }
}
