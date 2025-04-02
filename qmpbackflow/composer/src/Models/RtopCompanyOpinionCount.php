<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCompanyOpinionCount extends Model
{
    // 企业名称
    /**
     * @example 福州北辰智创投资中心
     *
     * @var string
     */
    public $companyName;

    // 企业对应的舆情数量
    /**
     * @example 10
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'companyName' => 'company_name',
        'count'       => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopCompanyOpinionCount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
