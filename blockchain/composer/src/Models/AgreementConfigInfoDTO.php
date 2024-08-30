<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AgreementConfigInfoDTO extends Model
{
    // 协议名称
    /**
     * @example testAgreementName
     *
     * @var string
     */
    public $agreementName;

    // 协议链接
    /**
     * @example testAgreementUrl
     *
     * @var string
     */
    public $agreementUrl;

    // 协议描述
    /**
     * @example testAgreementDesc
     *
     * @var string
     */
    public $agreementDesc;

    // 协议版本
    /**
     * @example 1
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'agreementName' => 'agreement_name',
        'agreementUrl'  => 'agreement_url',
        'agreementDesc' => 'agreement_desc',
        'version'       => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('agreementName', $this->agreementName, true);
        Model::validateRequired('agreementUrl', $this->agreementUrl, true);
        Model::validateRequired('agreementDesc', $this->agreementDesc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agreementName) {
            $res['agreement_name'] = $this->agreementName;
        }
        if (null !== $this->agreementUrl) {
            $res['agreement_url'] = $this->agreementUrl;
        }
        if (null !== $this->agreementDesc) {
            $res['agreement_desc'] = $this->agreementDesc;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgreementConfigInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agreement_name'])) {
            $model->agreementName = $map['agreement_name'];
        }
        if (isset($map['agreement_url'])) {
            $model->agreementUrl = $map['agreement_url'];
        }
        if (isset($map['agreement_desc'])) {
            $model->agreementDesc = $map['agreement_desc'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
