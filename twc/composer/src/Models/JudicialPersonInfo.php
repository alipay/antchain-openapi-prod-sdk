<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class JudicialPersonInfo extends Model
{
    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 身份证号码
    /**
     * @example 310101199901010011
     *
     * @var string
     */
    public $certNumber;

    // 联系电话
    /**
     * @example 1350000000
     *
     * @var string
     */
    public $phone;

    // 民族
    /**
     * @example 汉
     *
     * @var string
     */
    public $nationality;

    // 通讯地址
    /**
     * @example 通讯地址
     *
     * @var string
     */
    public $address;

    // 身份证明
    /**
     * @example
     *
     * @var JudicialFileInfo
     */
    public $identityCertification;

    // 职务
    /**
     * @example 法人代表
     *
     * @var string
     */
    public $jobTitle;

    // 任职证明
    /**
     * @example
     *
     * @var JudicialFileInfo
     */
    public $jobCertification;
    protected $_name = [
        'name'                  => 'name',
        'certNumber'            => 'cert_number',
        'phone'                 => 'phone',
        'nationality'           => 'nationality',
        'address'               => 'address',
        'identityCertification' => 'identity_certification',
        'jobTitle'              => 'job_title',
        'jobCertification'      => 'job_certification',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNumber) {
            $res['cert_number'] = $this->certNumber;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->nationality) {
            $res['nationality'] = $this->nationality;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->identityCertification) {
            $res['identity_certification'] = null !== $this->identityCertification ? $this->identityCertification->toMap() : null;
        }
        if (null !== $this->jobTitle) {
            $res['job_title'] = $this->jobTitle;
        }
        if (null !== $this->jobCertification) {
            $res['job_certification'] = null !== $this->jobCertification ? $this->jobCertification->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudicialPersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_number'])) {
            $model->certNumber = $map['cert_number'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['nationality'])) {
            $model->nationality = $map['nationality'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['identity_certification'])) {
            $model->identityCertification = JudicialFileInfo::fromMap($map['identity_certification']);
        }
        if (isset($map['job_title'])) {
            $model->jobTitle = $map['job_title'];
        }
        if (isset($map['job_certification'])) {
            $model->jobCertification = JudicialFileInfo::fromMap($map['job_certification']);
        }

        return $model;
    }
}
