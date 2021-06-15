<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CommitmentInfo extends Model
{
    // 租金总额
    /**
     * @example 7890.00
     *
     * @var string
     */
    public $totalRent;

    // 租赁分期信息
    /**
     * @example
     *
     * @var RentalStagingInformation[]
     */
    public $rentalStagingInformation;
    protected $_name = [
        'totalRent'                => 'total_rent',
        'rentalStagingInformation' => 'rental_staging_information',
    ];

    public function validate()
    {
        Model::validateRequired('totalRent', $this->totalRent, true);
        Model::validateRequired('rentalStagingInformation', $this->rentalStagingInformation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalRent) {
            $res['total_rent'] = $this->totalRent;
        }
        if (null !== $this->rentalStagingInformation) {
            $res['rental_staging_information'] = [];
            if (null !== $this->rentalStagingInformation && \is_array($this->rentalStagingInformation)) {
                $n = 0;
                foreach ($this->rentalStagingInformation as $item) {
                    $res['rental_staging_information'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommitmentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_rent'])) {
            $model->totalRent = $map['total_rent'];
        }
        if (isset($map['rental_staging_information'])) {
            if (!empty($map['rental_staging_information'])) {
                $model->rentalStagingInformation = [];
                $n                               = 0;
                foreach ($map['rental_staging_information'] as $item) {
                    $model->rentalStagingInformation[$n++] = null !== $item ? RentalStagingInformation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
