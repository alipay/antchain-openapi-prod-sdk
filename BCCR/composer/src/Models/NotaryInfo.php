<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryInfo extends Model
{
    // 公证书编号
    /**
     * @example 公证书编号
     *
     * @var string
     */
    public $notarialDeedNo;

    // 电子公证书文件路径
    /**
     * @example 电子公证书文件路径
     *
     * @var string
     */
    public $notaryPaperPath;

    // 公证书出证日期（yyyy-MM-dd）
    /**
     * @example 2022-10-17
     *
     * @var string
     */
    public $notaryTime;
    protected $_name = [
        'notarialDeedNo'  => 'notarial_deed_no',
        'notaryPaperPath' => 'notary_paper_path',
        'notaryTime'      => 'notary_time',
    ];

    public function validate()
    {
        Model::validateRequired('notarialDeedNo', $this->notarialDeedNo, true);
        Model::validateRequired('notaryPaperPath', $this->notaryPaperPath, true);
        Model::validateRequired('notaryTime', $this->notaryTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->notarialDeedNo) {
            $res['notarial_deed_no'] = $this->notarialDeedNo;
        }
        if (null !== $this->notaryPaperPath) {
            $res['notary_paper_path'] = $this->notaryPaperPath;
        }
        if (null !== $this->notaryTime) {
            $res['notary_time'] = $this->notaryTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['notarial_deed_no'])) {
            $model->notarialDeedNo = $map['notarial_deed_no'];
        }
        if (isset($map['notary_paper_path'])) {
            $model->notaryPaperPath = $map['notary_paper_path'];
        }
        if (isset($map['notary_time'])) {
            $model->notaryTime = $map['notary_time'];
        }

        return $model;
    }
}
