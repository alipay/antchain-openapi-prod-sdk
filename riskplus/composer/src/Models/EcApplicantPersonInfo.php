<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EcApplicantPersonInfo extends Model
{
    // 如果合作方传输，会在我行H5进件页面反显展示
    /**
     * @example 张三
     *
     * @var string
     */
    public $applicantName;

    // 申请人身份证号码
    /**
     * @example 6230582100000003260
     *
     * @var string
     */
    public $idNo;
    protected $_name = [
        'applicantName' => 'applicant_name',
        'idNo'          => 'id_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applicantName) {
            $res['applicant_name'] = $this->applicantName;
        }
        if (null !== $this->idNo) {
            $res['id_no'] = $this->idNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EcApplicantPersonInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['applicant_name'])) {
            $model->applicantName = $map['applicant_name'];
        }
        if (isset($map['id_no'])) {
            $model->idNo = $map['id_no'];
        }

        return $model;
    }
}
