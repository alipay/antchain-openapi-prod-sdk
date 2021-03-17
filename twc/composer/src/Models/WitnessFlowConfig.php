<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class WitnessFlowConfig extends Model
{
    // 企业实名认证方式,对公打款：1；企业芝麻认证：3；法定代表授权：4；
    /**
     * @example
     *
     * @var int[]
     */
    public $organRealnameTypes;

    // 个人实名认证方式, 银行四要素：2；芝麻认证-人脸识别：3；微众-人脸识别：4；
    /**
     * @example
     *
     * @var int[]
     */
    public $personRealnameTypes;

    // 是否需要实名认证
    /**
     * @example true, false
     *
     * @var bool
     */
    public $realNameCert;

    // 意愿认证方式, 芝麻认证-人脸识别：2；短信验证码：3；微众-人脸识别：4；ukey认证：5；签署密码认证：6；
    /**
     * @example
     *
     * @var int[]
     */
    public $willingnessTypes;
    protected $_name = [
        'organRealnameTypes'  => 'organ_realname_types',
        'personRealnameTypes' => 'person_realname_types',
        'realNameCert'        => 'real_name_cert',
        'willingnessTypes'    => 'willingness_types',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->organRealnameTypes) {
            $res['organ_realname_types'] = $this->organRealnameTypes;
        }
        if (null !== $this->personRealnameTypes) {
            $res['person_realname_types'] = $this->personRealnameTypes;
        }
        if (null !== $this->realNameCert) {
            $res['real_name_cert'] = $this->realNameCert;
        }
        if (null !== $this->willingnessTypes) {
            $res['willingness_types'] = $this->willingnessTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WitnessFlowConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['organ_realname_types'])) {
            if (!empty($map['organ_realname_types'])) {
                $model->organRealnameTypes = $map['organ_realname_types'];
            }
        }
        if (isset($map['person_realname_types'])) {
            if (!empty($map['person_realname_types'])) {
                $model->personRealnameTypes = $map['person_realname_types'];
            }
        }
        if (isset($map['real_name_cert'])) {
            $model->realNameCert = $map['real_name_cert'];
        }
        if (isset($map['willingness_types'])) {
            if (!empty($map['willingness_types'])) {
                $model->willingnessTypes = $map['willingness_types'];
            }
        }

        return $model;
    }
}
