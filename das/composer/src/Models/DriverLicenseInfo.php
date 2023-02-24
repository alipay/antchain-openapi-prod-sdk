<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DriverLicenseInfo extends Model
{
    // 性别
    /**
     * @example 男性
     *
     * @var string
     */
    public $gender;

    // 驾驶证发证日期
    /**
     * @example 暂无返回
     *
     * @var string
     */
    public $driveissuedate;

    // 驾驶证有效终止日期，当前日期减去实际日期的天数所在区间
    /**
     * @example A/-A
     *
     * @var string
     */
    public $validdate;

    // 驾驶证有效起始日期
    /**
     * @example A/-A
     *
     * @var string
     */
    public $drivevalidstartdate;

    // 驾驶证状态字典
    /**
     * @example A
     *
     * @var string
     */
    public $drivecardstatus;

    // 初次领证时间
    /**
     * @example A/-A
     *
     * @var string
     */
    public $firsissuedate;

    // 准驾车型，字典
    /**
     * @example A1
     *
     * @var string
     */
    public $allowdrivecar;

    // 驾驶证种类，字典
    /**
     * @example A
     *
     * @var string
     */
    public $drivelicensetype;
    protected $_name = [
        'gender'              => 'gender',
        'driveissuedate'      => 'driveissuedate',
        'validdate'           => 'validdate',
        'drivevalidstartdate' => 'drivevalidstartdate',
        'drivecardstatus'     => 'drivecardstatus',
        'firsissuedate'       => 'firsissuedate',
        'allowdrivecar'       => 'allowdrivecar',
        'drivelicensetype'    => 'drivelicensetype',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gender) {
            $res['gender'] = $this->gender;
        }
        if (null !== $this->driveissuedate) {
            $res['driveissuedate'] = $this->driveissuedate;
        }
        if (null !== $this->validdate) {
            $res['validdate'] = $this->validdate;
        }
        if (null !== $this->drivevalidstartdate) {
            $res['drivevalidstartdate'] = $this->drivevalidstartdate;
        }
        if (null !== $this->drivecardstatus) {
            $res['drivecardstatus'] = $this->drivecardstatus;
        }
        if (null !== $this->firsissuedate) {
            $res['firsissuedate'] = $this->firsissuedate;
        }
        if (null !== $this->allowdrivecar) {
            $res['allowdrivecar'] = $this->allowdrivecar;
        }
        if (null !== $this->drivelicensetype) {
            $res['drivelicensetype'] = $this->drivelicensetype;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DriverLicenseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gender'])) {
            $model->gender = $map['gender'];
        }
        if (isset($map['driveissuedate'])) {
            $model->driveissuedate = $map['driveissuedate'];
        }
        if (isset($map['validdate'])) {
            $model->validdate = $map['validdate'];
        }
        if (isset($map['drivevalidstartdate'])) {
            $model->drivevalidstartdate = $map['drivevalidstartdate'];
        }
        if (isset($map['drivecardstatus'])) {
            $model->drivecardstatus = $map['drivecardstatus'];
        }
        if (isset($map['firsissuedate'])) {
            $model->firsissuedate = $map['firsissuedate'];
        }
        if (isset($map['allowdrivecar'])) {
            $model->allowdrivecar = $map['allowdrivecar'];
        }
        if (isset($map['drivelicensetype'])) {
            $model->drivelicensetype = $map['drivelicensetype'];
        }

        return $model;
    }
}
