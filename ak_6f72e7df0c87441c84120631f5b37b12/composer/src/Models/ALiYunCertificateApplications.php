<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6f72e7df0c87441c84120631f5b37b12\Models;

use AlibabaCloud\Tea\Model;

class ALiYunCertificateApplications extends Model
{
    // certificate_application
    /**
     * @example certificate_application
     *
     * @var ALiYunCertificateApplication[]
     */
    public $certificateApplications;

    // pagination
    /**
     * @example pagination
     *
     * @var ALiYunPagination
     */
    public $pagination;
    protected $_name = [
        'certificateApplications' => 'certificate_applications',
        'pagination'              => 'pagination',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->certificateApplications) {
            $res['certificate_applications'] = [];
            if (null !== $this->certificateApplications && \is_array($this->certificateApplications)) {
                $n = 0;
                foreach ($this->certificateApplications as $item) {
                    $res['certificate_applications'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pagination) {
            $res['pagination'] = null !== $this->pagination ? $this->pagination->toMap() : null;
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
        if (isset($map['certificate_applications'])) {
            if (!empty($map['certificate_applications'])) {
                $model->certificateApplications = [];
                $n                              = 0;
                foreach ($map['certificate_applications'] as $item) {
                    $model->certificateApplications[$n++] = null !== $item ? ALiYunCertificateApplication::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pagination'])) {
            $model->pagination = ALiYunPagination::fromMap($map['pagination']);
        }

        return $model;
    }
}
