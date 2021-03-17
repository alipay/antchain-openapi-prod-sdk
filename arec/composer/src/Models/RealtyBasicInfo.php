<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class RealtyBasicInfo extends Model
{
    // 权证类型，可选值：HOUSE_OWNERSHIP_CERT,OTHER_RIGHT_CERT,REALTY_OWNERSHIP_CERT,MORTGAGE_REG_CERT
    /**
     * @example HOUSE_OWNERSHIP_CERT
     *
     * @var string
     */
    public $realtyCertType;

    // 权证号码
    /**
     * @example 浙杭字A-12312
     *
     * @var string
     */
    public $realtyCertNo;

    // 坐落位置
    /**
     * @example 浙江省杭州市西湖区文三路222号
     *
     * @var string
     */
    public $location;

    // 权利人列表
    /**
     * @example
     *
     * @var EntityBasicInfo[]
     */
    public $obligeeList;
    protected $_name = [
        'realtyCertType' => 'realty_cert_type',
        'realtyCertNo'   => 'realty_cert_no',
        'location'       => 'location',
        'obligeeList'    => 'obligee_list',
    ];

    public function validate()
    {
        Model::validateRequired('realtyCertType', $this->realtyCertType, true);
        Model::validateRequired('realtyCertNo', $this->realtyCertNo, true);
        Model::validateRequired('location', $this->location, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->realtyCertType) {
            $res['realty_cert_type'] = $this->realtyCertType;
        }
        if (null !== $this->realtyCertNo) {
            $res['realty_cert_no'] = $this->realtyCertNo;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->obligeeList) {
            $res['obligee_list'] = [];
            if (null !== $this->obligeeList && \is_array($this->obligeeList)) {
                $n = 0;
                foreach ($this->obligeeList as $item) {
                    $res['obligee_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RealtyBasicInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['realty_cert_type'])) {
            $model->realtyCertType = $map['realty_cert_type'];
        }
        if (isset($map['realty_cert_no'])) {
            $model->realtyCertNo = $map['realty_cert_no'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['obligee_list'])) {
            if (!empty($map['obligee_list'])) {
                $model->obligeeList = [];
                $n                  = 0;
                foreach ($map['obligee_list'] as $item) {
                    $model->obligeeList[$n++] = null !== $item ? EntityBasicInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
