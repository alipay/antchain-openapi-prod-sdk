<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DriverLicenseInfo extends Model
{
    // 性别，字典
    /**
     * @example 1
     *
     * @var string
     */
    public $gender;

    // 驾驶证发证日期,当前日期减去实际日期的天数所在区间
    /**
     * @example A/-A
     *
     * @var string
     */
    public $issueDate;

    // 驾驶证有效终止日期
    /**
     * @example A/-A
     *
     * @var string
     */
    public $validEndDate;

    // 驾驶证有效起始日期
    /**
     * @example A/-A
     *
     * @var string
     */
    public $validStartDate;

    // 驾驶证状态，字典
    /**
     * @example A
     *
     * @var string
     */
    public $driverLicenseStatus;

    // 初次领证时间
    /**
     * @example A/-A
     *
     * @var string
     */
    public $firstIssueDate;

    // 准驾车型，字典
    /**
     * @example A1
     *
     * @var string
     */
    public $allowDriveCar;

    // 驾驶证种类，字典
    /**
     * @example A
     *
     * @var string
     */
    public $driverLicenseType;
    protected $_name = [
        'gender'              => 'gender',
        'issueDate'           => 'issue_date',
        'validEndDate'        => 'valid_end_date',
        'validStartDate'      => 'valid_start_date',
        'driverLicenseStatus' => 'driver_license_status',
        'firstIssueDate'      => 'first_issue_date',
        'allowDriveCar'       => 'allow_drive_car',
        'driverLicenseType'   => 'driver_license_type',
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
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->validEndDate) {
            $res['valid_end_date'] = $this->validEndDate;
        }
        if (null !== $this->validStartDate) {
            $res['valid_start_date'] = $this->validStartDate;
        }
        if (null !== $this->driverLicenseStatus) {
            $res['driver_license_status'] = $this->driverLicenseStatus;
        }
        if (null !== $this->firstIssueDate) {
            $res['first_issue_date'] = $this->firstIssueDate;
        }
        if (null !== $this->allowDriveCar) {
            $res['allow_drive_car'] = $this->allowDriveCar;
        }
        if (null !== $this->driverLicenseType) {
            $res['driver_license_type'] = $this->driverLicenseType;
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
        if (isset($map['issue_date'])) {
            $model->issueDate = $map['issue_date'];
        }
        if (isset($map['valid_end_date'])) {
            $model->validEndDate = $map['valid_end_date'];
        }
        if (isset($map['valid_start_date'])) {
            $model->validStartDate = $map['valid_start_date'];
        }
        if (isset($map['driver_license_status'])) {
            $model->driverLicenseStatus = $map['driver_license_status'];
        }
        if (isset($map['first_issue_date'])) {
            $model->firstIssueDate = $map['first_issue_date'];
        }
        if (isset($map['allow_drive_car'])) {
            $model->allowDriveCar = $map['allow_drive_car'];
        }
        if (isset($map['driver_license_type'])) {
            $model->driverLicenseType = $map['driver_license_type'];
        }

        return $model;
    }
}
