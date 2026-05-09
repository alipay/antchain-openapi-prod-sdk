<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAASPLATFORM\Models;

use AlibabaCloud\Tea\Model;

class OperateSubject extends Model
{
    // 主体名称
    /**
     * @example 张*
     *
     * @var string
     */
    public $subjectName;

    // 证件类型,ID_CARD:身份证;PASSPORT:护照;BUSINESS_LICENSE:营业执照;OTHER:其他
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 证件号码，可以脱敏传输
    /**
     * @example 310***********1234
     *
     * @var string
     */
    public $certNo;

    // 主体信息明文计算出来的hash数据
    /**
     * @example a1b2c3d4e5f6789012345678901234567890abcd
     *
     * @var string
     */
    public $subjectHash;
    protected $_name = [
        'subjectName' => 'subject_name',
        'certType'    => 'cert_type',
        'certNo'      => 'cert_no',
        'subjectHash' => 'subject_hash',
    ];

    public function validate()
    {
        Model::validateRequired('subjectName', $this->subjectName, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('subjectHash', $this->subjectHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subjectName) {
            $res['subject_name'] = $this->subjectName;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->subjectHash) {
            $res['subject_hash'] = $this->subjectHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateSubject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['subject_name'])) {
            $model->subjectName = $map['subject_name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['subject_hash'])) {
            $model->subjectHash = $map['subject_hash'];
        }

        return $model;
    }
}
