<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class OrgVO extends Model
{
    // 机构ID
    /**
     * @example 1663225167260
     *
     * @var string
     */
    public $id;

    // 创建时间
    /**
     * @example 1663225167260
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 1663225167260
     *
     * @var int
     */
    public $gmtModified;

    // 机构名称
    /**
     * @example 机构名称
     *
     * @var string
     */
    public $name;

    // 统一社会信用代码
    /**
     * @example 166322516726012345
     *
     * @var string
     */
    public $unifiedSocialCreditCode;

    // 机构简介
    /**
     * @example 机构简介
     *
     * @var string
     */
    public $introduction;

    // 签约时间
    /**
     * @example 1663225167260
     *
     * @var int
     */
    public $signTime;

    // 测试项目:0正式机构(默认),1测试机构
    /**
     * @example 0
     *
     * @var int
     */
    public $testFlag;
    protected $_name = [
        'id'                      => 'id',
        'gmtCreate'               => 'gmt_create',
        'gmtModified'             => 'gmt_modified',
        'name'                    => 'name',
        'unifiedSocialCreditCode' => 'unified_social_credit_code',
        'introduction'            => 'introduction',
        'signTime'                => 'sign_time',
        'testFlag'                => 'test_flag',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('unifiedSocialCreditCode', $this->unifiedSocialCreditCode, true);
        Model::validateRequired('introduction', $this->introduction, true);
        Model::validateRequired('signTime', $this->signTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->unifiedSocialCreditCode) {
            $res['unified_social_credit_code'] = $this->unifiedSocialCreditCode;
        }
        if (null !== $this->introduction) {
            $res['introduction'] = $this->introduction;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->testFlag) {
            $res['test_flag'] = $this->testFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrgVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['unified_social_credit_code'])) {
            $model->unifiedSocialCreditCode = $map['unified_social_credit_code'];
        }
        if (isset($map['introduction'])) {
            $model->introduction = $map['introduction'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['test_flag'])) {
            $model->testFlag = $map['test_flag'];
        }

        return $model;
    }
}
