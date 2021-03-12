<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunCertificateApplications extends Model
{
    // pagination
    /**
     * @example pagination
     *
     * @var ALiYunPagination
     */
    public $pagination;

    // certificate_application
    /**
     * @example certificate_application
     *
     * @var ALiYunCertificateApplication[]
     */
    public $certificateApplications;
    protected $_name = [
        'pagination'              => 'pagination',
        'certificateApplications' => 'certificate_applications',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
        }
        if (null !== $this->certificateApplications) {
            $res['certificate_applications'] = [];
            if (null !== $this->certificateApplications && \is_array($this->certificateApplications)) {
                $n = 0;
                foreach ($this->certificateApplications as $item) {
                    $res['certificate_applications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunCertificateApplications
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }
        if (isset($map['certificate_applications'])) {
            if (!empty($map['certificate_applications'])) {
                $model->certificateApplications = [];
                $n                              = 0;
                foreach ($map['certificate_applications'] as $item) {
                    $model->certificateApplications[$n++] = null !== $item ? ALiYunCertificateApplication::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
