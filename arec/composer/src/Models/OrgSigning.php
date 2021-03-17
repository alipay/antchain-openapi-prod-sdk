<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class OrgSigning extends Model
{
    // 企业印章ID，如不填写则使用企业默认印章，如果无默认印章则报错
    /**
     * @example 1123123
     *
     * @var string
     */
    public $orgSealId;

    // 机构签署页码，从第1页开始
    //
    //
    /**
     * @example 2
     *
     * @var int
     */
    public $orgSignPageNo;

    // 机构签署页位置的X坐标，企业盖章页位置的X坐标值，为距离左边边界的位置，单位为PX
    //
    //
    /**
     * @example 4.5
     *
     * @var string
     */
    public $orgSignCoordinateX;

    // 机构签署页位置的Y坐标，企业盖章页位置的Y坐标值，为距离下边界的位置，单位为PX。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
    /**
     * @example 20.4
     *
     * @var string
     */
    public $orgSignCoordinateY;
    protected $_name = [
        'orgSealId'          => 'org_seal_id',
        'orgSignPageNo'      => 'org_sign_page_no',
        'orgSignCoordinateX' => 'org_sign_coordinate_x',
        'orgSignCoordinateY' => 'org_sign_coordinate_y',
    ];

    public function validate()
    {
        Model::validateRequired('orgSignPageNo', $this->orgSignPageNo, true);
        Model::validateRequired('orgSignCoordinateX', $this->orgSignCoordinateX, true);
        Model::validateRequired('orgSignCoordinateY', $this->orgSignCoordinateY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgSealId) {
            $res['org_seal_id'] = $this->orgSealId;
        }
        if (null !== $this->orgSignPageNo) {
            $res['org_sign_page_no'] = $this->orgSignPageNo;
        }
        if (null !== $this->orgSignCoordinateX) {
            $res['org_sign_coordinate_x'] = $this->orgSignCoordinateX;
        }
        if (null !== $this->orgSignCoordinateY) {
            $res['org_sign_coordinate_y'] = $this->orgSignCoordinateY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrgSigning
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_seal_id'])) {
            $model->orgSealId = $map['org_seal_id'];
        }
        if (isset($map['org_sign_page_no'])) {
            $model->orgSignPageNo = $map['org_sign_page_no'];
        }
        if (isset($map['org_sign_coordinate_x'])) {
            $model->orgSignCoordinateX = $map['org_sign_coordinate_x'];
        }
        if (isset($map['org_sign_coordinate_y'])) {
            $model->orgSignCoordinateY = $map['org_sign_coordinate_y'];
        }

        return $model;
    }
}
